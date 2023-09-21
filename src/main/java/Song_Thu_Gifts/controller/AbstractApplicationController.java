package Song_Thu_Gifts.controller;

import Song_Thu_Gifts.util.ApplicationMapper;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractApplicationController {
    @Autowired
    ApplicationMapper mapper;
}
