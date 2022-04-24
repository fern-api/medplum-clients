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
    as = ImmutableCondition.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Condition {
  Optional<List<Condition_Stage>> stage();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> severity();

  Optional<String> onsetString();

  Optional<CodeableConcept> code();

  Reference subject();

  Optional<Reference> encounter();

  Optional<id> id();

  Optional<List<CodeableConcept>> bodySite();

  Optional<uri> implicitRules();

  Optional<Meta> meta();

  Optional<List<Identifier>> identifier();

  Optional<Narrative> text();

  Optional<String> abatementDateTime();

  Optional<Range> abatementRange();

  Optional<code> language();

  Optional<Reference> asserter();

  Optional<List<Annotation>> note();

  Optional<List<CodeableConcept>> category();

  Optional<Age> onsetAge();

  Optional<Reference> recorder();

  Optional<List<Extension>> modifierExtension();

  Optional<Range> onsetRange();

  Optional<String> onsetDateTime();

  String resourceType();

  Optional<String> abatementString();

  Optional<List<ResourceList>> contained();

  Optional<CodeableConcept> clinicalStatus();

  Optional<Age> abatementAge();

  Optional<Period> onsetPeriod();

  Optional<Period> abatementPeriod();

  Optional<dateTime> recordedDate();

  Optional<CodeableConcept> verificationStatus();

  Optional<List<Condition_Evidence>> evidence();

  static ImmutableCondition.SubjectBuildStage builder() {
    return ImmutableCondition.builder();
  }
}
