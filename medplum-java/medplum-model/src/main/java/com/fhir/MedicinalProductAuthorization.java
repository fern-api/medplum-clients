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
    as = ImmutableMedicinalProductAuthorization.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicinalProductAuthorization {
  Optional<List<Identifier>> identifier();

  Optional<Period> validityPeriod();

  Optional<uri> implicitRules();

  Optional<List<CodeableConcept>> country();

  Optional<Reference> subject();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<List<ResourceList>> contained();

  Optional<Period> dataExclusivityPeriod();

  Optional<dateTime> internationalBirthDate();

  Optional<Narrative> text();

  Optional<dateTime> dateOfFirstAuthorization();

  Optional<dateTime> statusDate();

  Optional<Reference> holder();

  String resourceType();

  Optional<CodeableConcept> status();

  Optional<dateTime> restoreDate();

  Optional<List<MedicinalProductAuthorization_JurisdictionalAuthorization>> jurisdictionalAuthorization(
      );

  Optional<id> id();

  Optional<List<Extension>> modifierExtension();

  Optional<MedicinalProductAuthorization_Procedure> procedure();

  Optional<Reference> regulator();

  Optional<code> language();

  Optional<Meta> meta();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> legalBasis();

  static ImmutableMedicinalProductAuthorization.ResourceTypeBuildStage builder() {
    return ImmutableMedicinalProductAuthorization.builder();
  }
}
