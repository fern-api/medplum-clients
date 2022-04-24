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
    as = ImmutableAllergyIntolerance.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface AllergyIntolerance {
  Optional<code> language();

  Optional<List<ResourceList>> contained();

  Optional<Narrative> text();

  Optional<Reference> recorder();

  Optional<uri> implicitRules();

  Optional<dateTime> recordedDate();

  Optional<Reference> asserter();

  Reference patient();

  Optional<List<Annotation>> note();

  Optional<List<Extension>> extension();

  Optional<Period> onsetPeriod();

  Optional<dateTime> lastOccurrence();

  Optional<id> id();

  Optional<AllergyintoleranceCriticality> criticality();

  Optional<List<AllergyIntolerance_Reaction>> reaction();

  Optional<Range> onsetRange();

  Optional<String> onsetString();

  Optional<List<Extension>> modifierExtension();

  Optional<AllergyintoleranceType> type();

  Optional<List<AllergyintoleranceCategoryItem>> category();

  Optional<Age> onsetAge();

  Optional<Meta> meta();

  String resourceType();

  Optional<List<Identifier>> identifier();

  Optional<CodeableConcept> verificationStatus();

  Optional<CodeableConcept> clinicalStatus();

  Optional<CodeableConcept> code();

  Optional<String> onsetDateTime();

  Optional<Reference> encounter();

  static ImmutableAllergyIntolerance.PatientBuildStage builder() {
    return ImmutableAllergyIntolerance.builder();
  }
}
