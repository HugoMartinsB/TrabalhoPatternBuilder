import com.finan.orcamento.Observer.EstoqueSubject;

import java.util.ArrayList;
import java.util.List;

    interface Observer<EstoqueSubject> {
        void update(EstoqueSubject subject);
    }

    class Subject {
        private List<Observer> observers = new ArrayList<>();

        public void attach(Observer observer) {
            observers.add(observer);
        }

        public void detach(Observer observer) {
            observers.remove(observer);
        }

        public void notifyObservers(EstoqueSubject subject) {
            for (Observer observer : observers) {
                observer.update(subject);
            }
        }
    }

