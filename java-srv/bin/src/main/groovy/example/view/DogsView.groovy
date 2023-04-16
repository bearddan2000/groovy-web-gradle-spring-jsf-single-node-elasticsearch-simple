package example.view;

import java.io.Serializable;
import java.util.*;

import example.model.Dog;
import example.repository.DogRepository;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="DogsView")
@SessionScoped
public class DogsView implements Serializable {

  private static final long serialVersionUID = 1L;

  public static List<Dog> getDogs() {
	    List<Dog> list = new ArrayList<Dog>();
			list << new Dog(1L, "Am Bulldog", "White");
			list << new Dog(2L, "Foxhound", "Red");
			list << new Dog(3L, "Gr Shepard", "Black");

      return list;
  }
}
