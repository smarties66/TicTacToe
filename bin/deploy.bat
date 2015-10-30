@echo off
set APP=TicTacToe
set LOCATION=C:\temp

REM Always deploy new version, clean before
call bin\clean.bat
call bin\package.bat

REM IF app folder exists under C:\temp, remove it
if not exist "%LOCATION% mkdir %LOCATION%

xcopy /E build\install %LOCATION%

RE; Run application once
%LOCATION%\\%APP%\\bin\\%APP%
