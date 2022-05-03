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
    as = ImmutableCompartmentDefinition.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface CompartmentDefinition {
  Optional<Id> id();

  Optional<Boolean> search();

  Optional<DateTime> date();

  Optional<List<UsageContext>> useContext();

  Optional<CompartmentdefinitionCode> code();

  Optional<Boolean> experimental();

  Optional<Markdown> purpose();

  Optional<List<ContactDetail>> contact();

  Optional<String> name();

  Optional<List<Extension>> extension();

  Optional<Markdown> description();

  Optional<List<CompartmentDefinition_Resource>> resource();

  Optional<List<Extension>> modifierExtension();

  Optional<Code> language();

  String resourceType();

  Optional<Uri> implicitRules();

  Optional<List<ResourceList>> contained();

  Optional<Uri> url();

  Optional<CompartmentdefinitionStatus> status();

  Optional<Narrative> text();

  Optional<Meta> meta();

  Optional<String> version();

  Optional<String> publisher();

  static ImmutableCompartmentDefinition.ResourceTypeBuildStage builder() {
    return ImmutableCompartmentDefinition.builder();
  }
}
