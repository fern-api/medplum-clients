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
  String resourceType();

  Optional<Boolean> actual();

  Optional<Code> language();

  Optional<List<Group_Characteristic>> characteristic();

  Optional<List<Extension>> extension();

  Optional<GroupType> type();

  Optional<Boolean> active();

  Optional<Reference> managingEntity();

  Optional<List<ResourceList>> contained();

  Optional<UnsignedInt> quantity();

  Optional<Meta> meta();

  Optional<List<Identifier>> identifier();

  Optional<List<Group_Member>> member();

  Optional<Id> id();

  Optional<Narrative> text();

  Optional<List<Extension>> modifierExtension();

  Optional<Uri> implicitRules();

  Optional<CodeableConcept> code();

  Optional<String> name();

  static ImmutableGroup.ResourceTypeBuildStage builder() {
    return ImmutableGroup.builder();
  }
}
