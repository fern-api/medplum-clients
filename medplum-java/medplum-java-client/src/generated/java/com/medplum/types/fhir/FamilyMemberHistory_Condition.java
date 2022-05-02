package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
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
  Optional<List<Extension>> modifierExtension();

  CodeableConcept code();

  Optional<List<Annotation>> note();

  Optional<CodeableConcept> outcome();

  Optional<String> id();

  Optional<Range> onsetRange();

  Optional<Age> onsetAge();

  Optional<String> onsetString();

  Optional<Boolean> contributedToDeath();

  Optional<List<Extension>> extension();

  Optional<Period> onsetPeriod();

  static ImmutableFamilyMemberHistory_Condition.CodeBuildStage builder() {
    return ImmutableFamilyMemberHistory_Condition.builder();
  }
}
