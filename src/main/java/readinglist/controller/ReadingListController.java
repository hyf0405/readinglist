package readinglist.controller;

import readinglist.service.ReadingListRepository;

public class ReadingListController {
    private ReadingListRepository readingListRepository;

    public ReadingListController(ReadingListRepository readingListRepository) {
        this.readingListRepository = readingListRepository;
    }


}
