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
    as = ImmutableAllergyIntolerance.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface AllergyIntolerance {
  Optional<Reference> encounter();

  Optional<List<AllergyIntolerance_Reaction>> reaction();

  Optional<Code> language();

  Optional<List<Extension>> modifierExtension();

  Optional<Uri> implicitRules();

  Optional<DateTime> lastOccurrence();

  Optional<List<ResourceList>> contained();

  Optional<Id> id();

  Optional<String> onsetString();

  Optional<CodeableConcept> clinicalStatus();

  Optional<DateTime> recordedDate();

  Optional<CodeableConcept> code();

  Reference patient();

  Optional<List<AllergyintoleranceCategoryItem>> category();

  Optional<String> onsetDateTime();

  Optional<List<Annotation>> note();

  Optional<List<Extension>> extension();

  Optional<Narrative> text();

  Optional<Reference> asserter();

  Optional<List<Identifier>> identifier();

  Optional<AllergyintoleranceType> type();

  Optional<AllergyintoleranceCriticality> criticality();

  String resourceType();

  Optional<Meta> meta();

  Optional<Reference> recorder();

  Optional<Range> onsetRange();

  Optional<Period> onsetPeriod();

  Optional<Age> onsetAge();

  Optional<CodeableConcept> verificationStatus();

  static ImmutableAllergyIntolerance.PatientBuildStage builder() {
    return ImmutableAllergyIntolerance.builder();
  }
}
