package com.upc.techelp.platform.monitoring.interfaces.rest.transform;

import com.upc.techelp.platform.monitoring.domain.model.commands.CreateComponentItemCommand;
import com.upc.techelp.platform.monitoring.interfaces.rest.resources.CreateInventoryResource;

import java.util.ArrayList;
import java.util.List;

public class CreateInventoryFromResourceAssembler {
    public static List<CreateComponentItemCommand> toCommandFrom(CreateInventoryResource resource){
        List<CreateComponentItemCommand> listCommands = new ArrayList<>();
        var items = resource.items();
        for(int i=0; i < resource.items().size(); i++){
            listCommands.add(new CreateComponentItemCommand(items.get(i).name(),items.get(i).quantity(),
                    items.get(i).price(),resource.technicalId()));
        }
        return listCommands;
    }
}
