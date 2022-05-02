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
  Optional<Id> id();

  Optional<List<Extension>> extension();

  Optional<String> onsetDateTime();

  Optional<DateTime> lastOccurrence();

  Optional<CodeableConcept> verificationStatus();

  Reference patient();

  Optional<Uri> implicitRules();

  Optional<Narrative> text();

  Optional<Code> language();

  Optional<Period> onsetPeriod();

  Optional<List<AllergyintoleranceCategoryItem>> category();

  Optional<List<Annotation>> note();

  Optional<AllergyintoleranceType> type();

  Optional<Meta> meta();

  Optional<String> onsetString();

  Optional<List<Extension>> modifierExtension();

  Optional<DateTime> recordedDate();

  Optional<CodeableConcept> clinicalStatus();

  Optional<List<AllergyIntolerance_Reaction>> reaction();

  Optional<CodeableConcept> code();

  Optional<Age> onsetAge();

  Optional<List<ResourceList>> contained();

  Optional<Reference> asserter();

  String resourceType();

  Optional<Reference> recorder();

  Optional<Range> onsetRange();

  Optional<List<Identifier>> identifier();

  Optional<AllergyintoleranceCriticality> criticality();

  Optional<Reference> encounter();

  static ImmutableAllergyIntolerance.PatientBuildStage builder() {
    return ImmutableAllergyIntolerance.builder();
  }
}
