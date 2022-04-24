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
    as = ImmutableFamilyMemberHistory.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface FamilyMemberHistory {
  Optional<List<Reference>> reasonReference();

  Optional<Boolean> estimatedAge();

  Optional<Meta> meta();

  Optional<Age> deceasedAge();

  Optional<String> ageString();

  Optional<uri> implicitRules();

  Optional<List<Extension>> modifierExtension();

  Optional<Range> ageRange();

  Optional<CodeableConcept> dataAbsentReason();

  Optional<String> deceasedString();

  Optional<List<Annotation>> note();

  Optional<List<FamilyMemberHistory_Condition>> condition();

  Optional<String> bornDate();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<String> deceasedDate();

  Optional<List<Identifier>> identifier();

  Optional<FamilymemberhistoryStatus> status();

  Optional<Period> bornPeriod();

  Optional<code> language();

  Optional<String> name();

  Optional<Boolean> deceasedBoolean();

  Optional<List<Extension>> extension();

  Optional<String> bornString();

  Optional<Age> ageAge();

  Optional<dateTime> date();

  Optional<List<ResourceList>> contained();

  Optional<List<canonical>> instantiatesCanonical();

  Optional<id> id();

  Optional<Narrative> text();

  Optional<Range> deceasedRange();

  Optional<CodeableConcept> sex();

  Optional<List<uri>> instantiatesUri();

  Reference patient();

  CodeableConcept relationship();

  String resourceType();

  static ImmutableFamilyMemberHistory.PatientBuildStage builder() {
    return ImmutableFamilyMemberHistory.builder();
  }
}
