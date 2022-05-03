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
  Optional<Period> bornPeriod();

  Optional<Narrative> text();

  Optional<Range> deceasedRange();

  Optional<List<ResourceList>> contained();

  Optional<Boolean> estimatedAge();

  Optional<List<Uri>> instantiatesUri();

  Optional<String> name();

  Optional<CodeableConcept> sex();

  Optional<String> ageString();

  Optional<Meta> meta();

  Optional<Range> ageRange();

  Optional<List<CodeableConcept>> reasonCode();

  CodeableConcept relationship();

  Optional<Boolean> deceasedBoolean();

  Optional<Id> id();

  Optional<DateTime> date();

  Optional<List<Annotation>> note();

  Optional<String> deceasedDate();

  Optional<String> deceasedString();

  Optional<String> bornString();

  Optional<String> bornDate();

  Optional<Age> ageAge();

  Optional<List<Canonical>> instantiatesCanonical();

  Optional<List<FamilyMemberHistory_Condition>> condition();

  String resourceType();

  Reference patient();

  Optional<Code> language();

  Optional<List<Reference>> reasonReference();

  Optional<List<Extension>> extension();

  Optional<Uri> implicitRules();

  Optional<List<Extension>> modifierExtension();

  Optional<FamilymemberhistoryStatus> status();

  Optional<List<Identifier>> identifier();

  Optional<CodeableConcept> dataAbsentReason();

  Optional<Age> deceasedAge();

  static ImmutableFamilyMemberHistory.RelationshipBuildStage builder() {
    return ImmutableFamilyMemberHistory.builder();
  }
}
