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
  Optional<CodeableConcept> legalBasis();

  Optional<DateTime> statusDate();

  Optional<CodeableConcept> status();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> extension();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<List<Identifier>> identifier();

  Optional<Period> validityPeriod();

  Optional<MedicinalProductAuthorization_Procedure> procedure();

  String resourceType();

  Optional<List<CodeableConcept>> country();

  Optional<Id> id();

  Optional<DateTime> restoreDate();

  Optional<DateTime> dateOfFirstAuthorization();

  Optional<DateTime> internationalBirthDate();

  Optional<Uri> implicitRules();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> holder();

  Optional<Reference> subject();

  Optional<Reference> regulator();

  Optional<Period> dataExclusivityPeriod();

  Optional<Code> language();

  Optional<List<MedicinalProductAuthorization_JurisdictionalAuthorization>> jurisdictionalAuthorization(
      );

  Optional<Narrative> text();

  Optional<Meta> meta();

  static ImmutableMedicinalProductAuthorization.ResourceTypeBuildStage builder() {
    return ImmutableMedicinalProductAuthorization.builder();
  }
}
