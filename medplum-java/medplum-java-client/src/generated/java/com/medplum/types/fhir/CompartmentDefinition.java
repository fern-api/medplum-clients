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
  Optional<List<Extension>> extension();

  Optional<String> version();

  Optional<List<UsageContext>> useContext();

  Optional<Boolean> search();

  Optional<DateTime> date();

  Optional<Markdown> purpose();

  Optional<List<ResourceList>> contained();

  Optional<Narrative> text();

  Optional<Uri> url();

  Optional<CompartmentdefinitionCode> code();

  Optional<Meta> meta();

  String resourceType();

  Optional<Markdown> description();

  Optional<List<ContactDetail>> contact();

  Optional<List<Extension>> modifierExtension();

  Optional<String> name();

  Optional<CompartmentdefinitionStatus> status();

  Optional<Uri> implicitRules();

  Optional<Code> language();

  Optional<String> publisher();

  Optional<Id> id();

  Optional<Boolean> experimental();

  Optional<List<CompartmentDefinition_Resource>> resource();

  static ImmutableCompartmentDefinition.ResourceTypeBuildStage builder() {
    return ImmutableCompartmentDefinition.builder();
  }
}
