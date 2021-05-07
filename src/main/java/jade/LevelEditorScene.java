package jade;

import java.awt.event.KeyEvent;

public class LevelEditorScene extends Scene {

    private boolean changingScene = false;
    private float timeToChangingScene = 2.0f;

    public LevelEditorScene() {
        System.out.println("Inside level editor Scene");

    }

    @Override
    public void update(float dt) {

        if (KeyListener.isKeyPressed(KeyEvent.VK_SPACE)) {
            changingScene = true;
        }

        if (changingScene && timeToChangingScene > 0) {
            timeToChangingScene -= dt;
            Window.get().r -= 0.5f * dt;
            Window.get().g -= 0.5f * dt;
            Window.get().b -= 0.5f * dt;
        }
        else if (changingScene) {
            Window.changeScene(1);
        }
    }

}
