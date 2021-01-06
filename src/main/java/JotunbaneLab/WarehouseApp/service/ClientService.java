package JotunbaneLab.WarehouseApp.service;

import JotunbaneLab.WarehouseApp.model.dto.ClientDTO;
import JotunbaneLab.WarehouseApp.model.entity.Client;
import JotunbaneLab.WarehouseApp.repository.ClientRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.modelmapper.spi.MatchingStrategy;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClientService {
    ClientRepository clientRepository;
    ModelMapper modelMapper;

    public ClientService(ClientRepository clientRepository, ModelMapper modelMapper) {
        this.clientRepository = clientRepository;
        this.modelMapper = modelMapper;
    }

    public void addClient(ClientDTO clientDTO){
        System.out.println("Client added: " + clientDTO.getName() + " " + clientDTO.getAdress());
        Client client = modelMapper.map(clientDTO, Client.class);
        clientRepository.save(client);
    }

    public List<ClientDTO> getAllClients() {
/*        modelMapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.LOOSE);*/
        return clientRepository.findAll()
                .stream()
                .map(client -> modelMapper.map(client, ClientDTO.class))
                .collect(Collectors.toList());
    }

    public void deleteClient(long id){
        clientRepository.deleteById(id);
    }
}
