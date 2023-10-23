package com.sudoku.userInterface.Logic;

import com.sudoku.problemDomain.IStorage;
import com.sudoku.problemDomain.SudokuGame;
import com.sudoku.userInterface.IUserInterfaceContract;

import java.io.IOException;

public class ControlLogic implements IUserInterfaceContract.EventListener {

    private IStorage storage;
    private  IUserInterfaceContract.View view;

    public ControlLogic(IStorage storage, IUserInterfaceContract.View view) {
        this.storage = storage;
        this.view = view;
    }

    @Override
    public void onSudokuInput(int x, int y, int input) {
        try{
            SudokuGame gameData = storage.getGameData();
            int [][] newGridState = gameData.getCopyOfGridState();
            newGridState[x][y] = input;
            
        }catch(IOException e){

        }
    }

    @Override
    public void onDialogClick() {

    }
}
