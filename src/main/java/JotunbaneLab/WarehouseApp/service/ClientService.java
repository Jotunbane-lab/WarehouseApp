package JotunbaneLab.WarehouseApp.service;

import JotunbaneLab.WarehouseApp.model.dto.ClientDTO;
import JotunbaneLab.WarehouseApp.model.entity.Client;
import JotunbaneLab.WarehouseApp.repository.OrderRepository;
import JotunbaneLab.WarehouseApp.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClientService {
    UserRepository userRepository;
    OrderRepository orderRepository;
    ModelMapper modelMapper;

    public ClientService(UserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }

    public void addClient(ClientDTO clientDTO){
        System.out.println("Client added: " + clientDTO.getName() + " " + clientDTO.getAdress());
        Client client = modelMapper.map(clientDTO, Client.class);
        userRepository.save(client);
    }

    public List<ClientDTO> getAllClients() {
        return userRepository.findAll()
                .stream()
                .map(client -> modelMapper.map(client, ClientDTO.class))
                .collect(Collectors.toList());
    }

    public void deleteClient(long id){
        userRepository.deleteById(id);
    }
}
