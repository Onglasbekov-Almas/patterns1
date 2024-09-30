package org.example;
interface Button {
    void render();
}

class DarkThemeButton implements Button {
    @Override
    public void render() {
        System.out.println("Рисуем кнопку в темной теме.");
    }
}

interface UIFactory {
    Button createButton();
}

class DarkThemeFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new DarkThemeButton();
    }
}
