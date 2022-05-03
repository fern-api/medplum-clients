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
  Optional<AllergyintoleranceType> type();

  Optional<Meta> meta();

  Optional<Narrative> text();

  Optional<CodeableConcept> clinicalStatus();

  Optional<DateTime> recordedDate();

  Optional<Code> language();

  Optional<List<Annotation>> note();

  Optional<List<Extension>> extension();

  Optional<Reference> recorder();

  Optional<Reference> asserter();

  Optional<AllergyintoleranceCriticality> criticality();

  Optional<DateTime> lastOccurrence();

  String resourceType();

  Optional<List<Extension>> modifierExtension();

  Optional<Period> onsetPeriod();

  Optional<List<ResourceList>> contained();

  Optional<Id> id();

  Optional<CodeableConcept> verificationStatus();

  Optional<List<Identifier>> identifier();

  Optional<Age> onsetAge();

  Optional<List<AllergyintoleranceCategoryItem>> category();

  Optional<Uri> implicitRules();

  Reference patient();

  Optional<CodeableConcept> code();

  Optional<Reference> encounter();

  Optional<List<AllergyIntolerance_Reaction>> reaction();

  Optional<Range> onsetRange();

  Optional<String> onsetDateTime();

  Optional<String> onsetString();

  static ImmutableAllergyIntolerance.ResourceTypeBuildStage builder() {
    return ImmutableAllergyIntolerance.builder();
  }
}
