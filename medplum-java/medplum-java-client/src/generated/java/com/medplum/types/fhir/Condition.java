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
  Optional<List<CodeableConcept>> category();

  Optional<CodeableConcept> severity();

  Optional<Period> onsetPeriod();

  Optional<Id> id();

  Optional<Uri> implicitRules();

  Optional<List<Condition_Stage>> stage();

  Optional<String> abatementString();

  Optional<Narrative> text();

  Optional<Reference> asserter();

  Optional<List<ResourceList>> contained();

  Optional<Age> abatementAge();

  Optional<String> onsetDateTime();

  Optional<List<Annotation>> note();

  Optional<Period> abatementPeriod();

  Optional<CodeableConcept> clinicalStatus();

  Optional<Meta> meta();

  Optional<List<Identifier>> identifier();

  Optional<Reference> encounter();

  Optional<Reference> recorder();

  Optional<List<Condition_Evidence>> evidence();

  Optional<CodeableConcept> code();

  Optional<String> abatementDateTime();

  Optional<CodeableConcept> verificationStatus();

  Optional<List<CodeableConcept>> bodySite();

  Optional<DateTime> recordedDate();

  Optional<List<Extension>> extension();

  Optional<Range> abatementRange();

  Optional<Range> onsetRange();

  Optional<String> onsetString();

  String resourceType();

  Reference subject();

  Optional<Code> language();

  Optional<List<Extension>> modifierExtension();

  Optional<Age> onsetAge();

  static ImmutableCondition.ResourceTypeBuildStage builder() {
    return ImmutableCondition.builder();
  }
}
