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

  Optional<String> abatementString();

  Optional<Age> onsetAge();

  Optional<List<Condition_Evidence>> evidence();

  Optional<List<CodeableConcept>> category();

  Optional<List<Identifier>> identifier();

  Optional<Period> onsetPeriod();

  Optional<List<Extension>> extension();

  Optional<Period> abatementPeriod();

  Optional<List<CodeableConcept>> bodySite();

  Optional<CodeableConcept> verificationStatus();

  Optional<List<ResourceList>> contained();

  Optional<Reference> asserter();

  Optional<List<Condition_Stage>> stage();

  Optional<CodeableConcept> code();

  Optional<CodeableConcept> severity();

  Reference subject();

  Optional<Range> abatementRange();

  Optional<DateTime> recordedDate();

  String resourceType();

  Optional<Id> id();

  Optional<Meta> meta();

  Optional<Uri> implicitRules();

  Optional<List<Annotation>> note();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> encounter();

  Optional<String> abatementDateTime();

  Optional<Code> language();

  Optional<Reference> recorder();

  Optional<Range> onsetRange();

  Optional<Age> abatementAge();

  Optional<String> onsetString();

  Optional<CodeableConcept> clinicalStatus();

  static ImmutableCondition.SubjectBuildStage builder() {
    return ImmutableCondition.builder();
  }
}
