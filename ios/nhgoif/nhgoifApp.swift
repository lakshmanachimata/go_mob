//
//  nhgoifApp.swift
//  nhgoif
//
//  Created by lakshmana on 15/11/20.
//

import SwiftUI

@main
struct nhgoifApp: App {
    let persistenceController = PersistenceController.shared

    var body: some Scene {
        WindowGroup {
            ContentView()
                .environment(\.managedObjectContext, persistenceController.container.viewContext)
        }
    }
}
