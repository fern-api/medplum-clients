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
    as = ImmutableMedicinalProductAuthorization.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicinalProductAuthorization {
  Optional<Period> dataExclusivityPeriod();

  Optional<Meta> meta();

  Optional<Reference> subject();

  Optional<DateTime> internationalBirthDate();

  Optional<CodeableConcept> legalBasis();

  Optional<DateTime> restoreDate();

  Optional<List<Extension>> modifierExtension();

  Optional<Period> validityPeriod();

  Optional<List<MedicinalProductAuthorization_JurisdictionalAuthorization>> jurisdictionalAuthorization(
      );

  Optional<MedicinalProductAuthorization_Procedure> procedure();

  Optional<DateTime> statusDate();

  Optional<Code> language();

  Optional<Narrative> text();

  Optional<Reference> regulator();

  Optional<Uri> implicitRules();

  Optional<DateTime> dateOfFirstAuthorization();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<Reference> holder();

  String resourceType();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> status();

  Optional<List<ResourceList>> contained();

  Optional<Id> id();

  Optional<List<Identifier>> identifier();

  Optional<List<CodeableConcept>> country();

  static ImmutableMedicinalProductAuthorization.ResourceTypeBuildStage builder() {
    return ImmutableMedicinalProductAuthorization.builder();
  }
}
