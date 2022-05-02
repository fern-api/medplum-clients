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
    as = ImmutableFamilyMemberHistory.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface FamilyMemberHistory {
  Optional<List<Annotation>> note();

  Optional<Range> deceasedRange();

  Optional<String> bornString();

  Optional<DateTime> date();

  Optional<Age> ageAge();

  Optional<Period> bornPeriod();

  Optional<Uri> implicitRules();

  Optional<Boolean> deceasedBoolean();

  Optional<Narrative> text();

  Optional<List<Extension>> extension();

  Optional<String> name();

  Optional<String> ageString();

  Optional<List<Uri>> instantiatesUri();

  String resourceType();

  Reference patient();

  Optional<Code> language();

  Optional<List<Reference>> reasonReference();

  Optional<List<Extension>> modifierExtension();

  Optional<Age> deceasedAge();

  Optional<Meta> meta();

  Optional<List<Canonical>> instantiatesCanonical();

  CodeableConcept relationship();

  Optional<String> deceasedDate();

  Optional<List<Identifier>> identifier();

  Optional<List<FamilyMemberHistory_Condition>> condition();

  Optional<CodeableConcept> dataAbsentReason();

  Optional<Range> ageRange();

  Optional<CodeableConcept> sex();

  Optional<Boolean> estimatedAge();

  Optional<FamilymemberhistoryStatus> status();

  Optional<String> deceasedString();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<String> bornDate();

  Optional<Id> id();

  Optional<List<ResourceList>> contained();

  static ImmutableFamilyMemberHistory.ResourceTypeBuildStage builder() {
    return ImmutableFamilyMemberHistory.builder();
  }
}
