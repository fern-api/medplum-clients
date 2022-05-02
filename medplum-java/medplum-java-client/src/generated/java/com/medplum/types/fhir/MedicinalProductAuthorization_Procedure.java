package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
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
  Optional<List<Extension>> extension();

  Optional<List<MedicinalProductAuthorization_Procedure>> application();

  Optional<String> id();

  Optional<Identifier> identifier();

  Optional<List<Extension>> modifierExtension();

  CodeableConcept type();

  Optional<String> dateDateTime();

  Optional<Period> datePeriod();

  static ImmutableMedicinalProductAuthorization_Procedure.TypeBuildStage builder() {
    return ImmutableMedicinalProductAuthorization_Procedure.builder();
  }
}
