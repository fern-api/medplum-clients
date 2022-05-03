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
    as = ImmutableLinkage.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Linkage {
  Optional<Code> language();

  Optional<List<Extension>> modifierExtension();

  List<Linkage_Item> item();

  Optional<Uri> implicitRules();

  Optional<Id> id();

  Optional<Meta> meta();

  Optional<Reference> author();

  Optional<List<Extension>> extension();

  String resourceType();

  Optional<List<ResourceList>> contained();

  Optional<Boolean> active();

  Optional<Narrative> text();

  static ImmutableLinkage.ResourceTypeBuildStage builder() {
    return ImmutableLinkage.builder();
  }
}
