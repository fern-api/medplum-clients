package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableMedicinalProductAuthorization_Procedure.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicinalProductAuthorization_Procedure {
  Optional<List<Extension>> modifierExtension();

  CodeableConcept type();

  Optional<List<MedicinalProductAuthorization_Procedure>> application();

  Optional<Period> datePeriod();

  Optional<String> id();

  Optional<Identifier> identifier();

  Optional<String> dateDateTime();

  Optional<List<Extension>> extension();

  static ImmutableMedicinalProductAuthorization_Procedure.TypeBuildStage builder() {
    return ImmutableMedicinalProductAuthorization_Procedure.builder();
  }
}
