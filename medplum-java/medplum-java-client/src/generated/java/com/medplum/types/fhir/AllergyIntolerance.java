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
  Optional<DateTime> recordedDate();

  Optional<Narrative> text();

  Optional<AllergyintoleranceType> type();

  Optional<AllergyintoleranceCriticality> criticality();

  Optional<String> onsetDateTime();

  Optional<Reference> encounter();

  String resourceType();

  Optional<Uri> implicitRules();

  Optional<CodeableConcept> clinicalStatus();

  Optional<List<Extension>> extension();

  Optional<Code> language();

  Optional<List<AllergyintoleranceCategoryItem>> category();

  Optional<List<ResourceList>> contained();

  Optional<Age> onsetAge();

  Optional<Reference> recorder();

  Optional<Period> onsetPeriod();

  Optional<List<Extension>> modifierExtension();

  Optional<Meta> meta();

  Optional<Range> onsetRange();

  Optional<DateTime> lastOccurrence();

  Optional<List<Annotation>> note();

  Optional<String> onsetString();

  Optional<Id> id();

  Optional<Reference> asserter();

  Optional<List<Identifier>> identifier();

  Optional<List<AllergyIntolerance_Reaction>> reaction();

  Reference patient();

  Optional<CodeableConcept> code();

  Optional<CodeableConcept> verificationStatus();

  static ImmutableAllergyIntolerance.ResourceTypeBuildStage builder() {
    return ImmutableAllergyIntolerance.builder();
  }
}
