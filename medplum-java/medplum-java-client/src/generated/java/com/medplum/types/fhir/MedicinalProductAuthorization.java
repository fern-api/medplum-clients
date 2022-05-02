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
  Optional<List<CodeableConcept>> country();

  Optional<Narrative> text();

  Optional<CodeableConcept> legalBasis();

  Optional<List<Identifier>> identifier();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<DateTime> dateOfFirstAuthorization();

  Optional<DateTime> restoreDate();

  Optional<List<MedicinalProductAuthorization_JurisdictionalAuthorization>> jurisdictionalAuthorization(
      );

  Optional<Reference> holder();

  Optional<Id> id();

  String resourceType();

  Optional<List<Extension>> modifierExtension();

  Optional<Period> dataExclusivityPeriod();

  Optional<List<Extension>> extension();

  Optional<DateTime> internationalBirthDate();

  Optional<MedicinalProductAuthorization_Procedure> procedure();

  Optional<Reference> subject();

  Optional<Reference> regulator();

  Optional<Uri> implicitRules();

  Optional<Code> language();

  Optional<List<ResourceList>> contained();

  Optional<Meta> meta();

  Optional<CodeableConcept> status();

  Optional<Period> validityPeriod();

  Optional<DateTime> statusDate();

  static ImmutableMedicinalProductAuthorization.ResourceTypeBuildStage builder() {
    return ImmutableMedicinalProductAuthorization.builder();
  }
}
