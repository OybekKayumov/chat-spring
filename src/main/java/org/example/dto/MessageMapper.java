package org.example.dto;

import org.example.model.Message;

public class MessageMapper {

    public static DtoMessage map (Message message) {
        DtoMessage dtoMessage = new DtoMessage();
        dtoMessage.setDatetime(message.getDateTime().toString());
        dtoMessage.setUsername(message.getUser().getName());
        dtoMessage.setText(message.getMessage());

        return dtoMessage;
    }
}
