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
  Optional<Narrative> text();

  Optional<String> onsetDateTime();

  Optional<Meta> meta();

  Optional<CodeableConcept> code();

  Optional<String> onsetString();

  String resourceType();

  Optional<CodeableConcept> verificationStatus();

  Reference subject();

  Optional<Period> abatementPeriod();

  Optional<CodeableConcept> severity();

  Optional<List<Annotation>> note();

  Optional<Uri> implicitRules();

  Optional<Id> id();

  Optional<List<Extension>> extension();

  Optional<Range> abatementRange();

  Optional<List<Condition_Stage>> stage();

  Optional<Age> abatementAge();

  Optional<Reference> encounter();

  Optional<Period> onsetPeriod();

  Optional<Age> onsetAge();

  Optional<Reference> asserter();

  Optional<List<Condition_Evidence>> evidence();

  Optional<Range> onsetRange();

  Optional<CodeableConcept> clinicalStatus();

  Optional<Reference> recorder();

  Optional<List<CodeableConcept>> category();

  Optional<List<ResourceList>> contained();

  Optional<List<CodeableConcept>> bodySite();

  Optional<List<Identifier>> identifier();

  Optional<String> abatementString();

  Optional<Code> language();

  Optional<String> abatementDateTime();

  Optional<List<Extension>> modifierExtension();

  Optional<DateTime> recordedDate();

  static ImmutableCondition.ResourceTypeBuildStage builder() {
    return ImmutableCondition.builder();
  }
}
