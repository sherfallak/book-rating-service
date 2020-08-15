package fallak.microservices.bookratingservice.resources;

import fallak.microservices.bookratingservice.model.Rating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratings")
public class RatingResource {

    @RequestMapping("/{bookId}")
    public Rating getBookRating(@PathVariable String bookId){
        return new Rating(bookId,4);
    }


}
