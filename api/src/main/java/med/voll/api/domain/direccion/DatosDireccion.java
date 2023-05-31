package med.voll.api.domain.direccion;

import jakarta.validation.constraints.NotNull;

public record DatosDireccion(
        @NotNull
        String calle,
        @NotNull
        String distrito,
        @NotNull
        String ciudad,
        @NotNull
        String numero,
        @NotNull
        String complemento
) {
}
