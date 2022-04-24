package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableFamilyMemberHistory_Condition.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface FamilyMemberHistory_Condition {
  Optional<Boolean> contributedToDeath();

  Optional<List<Annotation>> note();

  CodeableConcept code();

  Optional<Range> onsetRange();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<String> onsetString();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> outcome();

  Optional<Age> onsetAge();

  Optional<Period> onsetPeriod();

  static ImmutableFamilyMemberHistory_Condition.CodeBuildStage builder() {
    return ImmutableFamilyMemberHistory_Condition.builder();
  }
}
