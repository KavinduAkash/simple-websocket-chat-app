package com.swlc.chatapp.modal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author hp
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Message {
    private String senderName;
    private String receiverName;
    private String message;
    private String date;
}
