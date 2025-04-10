package com.spring.ziggle.service;

import com.spring.ziggle.dto.MessageDto;
import com.spring.ziggle.repository.MessageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MessageService {

    private final MessageRepository messageRepository;

    public void addNewMessageRoom(MessageDto messageDto) {
        messageRepository.addNewMessageRoom(messageDto);
    }

    public MessageDto getMessageChatRoomById(String chatId, String key) {
        return messageRepository.getMessageChatRoomById(chatId, key);
    }

    public void updateIsSeen(String chatId, String key) {
        messageRepository.updateIsSeen(chatId, key);
    }

}
