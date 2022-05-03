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
  Optional<List<CodeableConcept>> jurisdiction();

  Optional<Period> validityPeriod();

  Optional<MedicinalProductAuthorization_Procedure> procedure();

  Optional<DateTime> internationalBirthDate();

  Optional<DateTime> statusDate();

  Optional<List<Extension>> modifierExtension();

  Optional<Meta> meta();

  Optional<Period> dataExclusivityPeriod();

  Optional<List<Extension>> extension();

  Optional<Narrative> text();

  Optional<List<CodeableConcept>> country();

  Optional<CodeableConcept> legalBasis();

  Optional<Reference> holder();

  Optional<Reference> subject();

  Optional<List<Identifier>> identifier();

  String resourceType();

  Optional<Id> id();

  Optional<Code> language();

  Optional<List<MedicinalProductAuthorization_JurisdictionalAuthorization>> jurisdictionalAuthorization(
      );

  Optional<CodeableConcept> status();

  Optional<DateTime> restoreDate();

  Optional<Uri> implicitRules();

  Optional<List<ResourceList>> contained();

  Optional<DateTime> dateOfFirstAuthorization();

  Optional<Reference> regulator();

  static ImmutableMedicinalProductAuthorization.ResourceTypeBuildStage builder() {
    return ImmutableMedicinalProductAuthorization.builder();
  }
}
