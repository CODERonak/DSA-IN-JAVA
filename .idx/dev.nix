{ pkgs, ... }: {

  channel = "stable-24.11";

  packages = [
    pkgs.jdk21 # Official Java 21
  ];
  idx = {
    extensions = [
      "vscjava.vscode-java-debug" # Java debugger
      "vscjava.vscode-java-pack" # Java extension pack (official)
    ];
  };
}