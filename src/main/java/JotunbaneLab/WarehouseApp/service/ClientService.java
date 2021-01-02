package JotunbaneLab.WarehouseApp.service;

import JotunbaneLab.WarehouseApp.model.dto.ClientDTO;
import JotunbaneLab.WarehouseApp.model.entity.Client;
import JotunbaneLab.WarehouseApp.repository.ClientRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

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
}
