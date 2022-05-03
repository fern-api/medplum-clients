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
    as = ImmutableGroup.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Group {
  Optional<Code> language();

  Optional<List<Extension>> extension();

  Optional<Boolean> active();

  Optional<Reference> managingEntity();

  Optional<List<Group_Characteristic>> characteristic();

  Optional<List<Extension>> modifierExtension();

  Optional<UnsignedInt> quantity();

  Optional<Uri> implicitRules();

  String resourceType();

  Optional<Meta> meta();

  Optional<List<ResourceList>> contained();

  Optional<GroupType> type();

  Optional<Id> id();

  Optional<List<Identifier>> identifier();

  Optional<Boolean> actual();

  Optional<CodeableConcept> code();

  Optional<String> name();

  Optional<Narrative> text();

  Optional<List<Group_Member>> member();

  static ImmutableGroup.ResourceTypeBuildStage builder() {
    return ImmutableGroup.builder();
  }
}
