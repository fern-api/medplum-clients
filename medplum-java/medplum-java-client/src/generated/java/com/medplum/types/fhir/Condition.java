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
    as = ImmutableCondition.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Condition {
  Optional<Code> language();

  Optional<Reference> recorder();

  Optional<Range> abatementRange();

  String resourceType();

  Optional<Meta> meta();

  Optional<List<CodeableConcept>> category();

  Optional<Age> abatementAge();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> verificationStatus();

  Optional<List<Annotation>> note();

  Optional<Reference> encounter();

  Reference subject();

  Optional<Range> onsetRange();

  Optional<CodeableConcept> severity();

  Optional<String> abatementString();

  Optional<List<Identifier>> identifier();

  Optional<List<Condition_Evidence>> evidence();

  Optional<Period> abatementPeriod();

  Optional<List<CodeableConcept>> bodySite();

  Optional<List<Condition_Stage>> stage();

  Optional<Narrative> text();

  Optional<Uri> implicitRules();

  Optional<List<ResourceList>> contained();

  Optional<String> onsetString();

  Optional<CodeableConcept> code();

  Optional<Age> onsetAge();

  Optional<Id> id();

  Optional<Reference> asserter();

  Optional<List<Extension>> extension();

  Optional<DateTime> recordedDate();

  Optional<String> abatementDateTime();

  Optional<Period> onsetPeriod();

  Optional<String> onsetDateTime();

  Optional<CodeableConcept> clinicalStatus();

  static ImmutableCondition.ResourceTypeBuildStage builder() {
    return ImmutableCondition.builder();
  }
}
