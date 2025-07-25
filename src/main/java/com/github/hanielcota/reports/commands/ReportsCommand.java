package com.github.hanielcota.reports.commands;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.*;
import com.github.hanielcota.reports.ReportsPlugin;
import com.github.hanielcota.reports.menus.ReportsMenu;
import com.github.hanielcota.reports.menus.view.ReportView;
import lombok.AllArgsConstructor;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

@CommandAlias("reports")
@CommandPermission("reports.admin")
@AllArgsConstructor
public class ReportsCommand extends BaseCommand {

    private final ReportsPlugin reportsPlugin;

    @Default
    public void onCommand(Player player) {
        ReportsMenu reportsMenu = new ReportsMenu(player, reportsPlugin);
        reportsMenu.open(player);
    }

    @Subcommand("ver")
    @CommandCompletion("@players")
    public void onViewReport(Player player, String[] args) {
        if (args.length == 0 || args[0] == null) {
            player.sendMessage("§cUso correto: /reports ver <nick>");
            return;
        }

        String playerName = args[0];
        Player target = Bukkit.getPlayerExact(playerName);

        if (target == null) {
            player.sendMessage("§cO jogador não está online ou não existe.");
            return;
        }

        ReportView reportView = new ReportView();
        reportView.createReportMenu(player, target, reportsPlugin);
    }
}
