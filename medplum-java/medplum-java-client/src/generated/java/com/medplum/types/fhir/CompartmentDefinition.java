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
  Optional<Uri> implicitRules();

  String resourceType();

  Optional<Id> id();

  Optional<Boolean> experimental();

  Optional<Boolean> search();

  Optional<List<ResourceList>> contained();

  Optional<String> publisher();

  Optional<Uri> url();

  Optional<Markdown> purpose();

  Optional<List<ContactDetail>> contact();

  Optional<List<Extension>> extension();

  Optional<Meta> meta();

  Optional<List<Extension>> modifierExtension();

  Optional<Narrative> text();

  Optional<List<UsageContext>> useContext();

  Optional<CompartmentdefinitionStatus> status();

  Optional<DateTime> date();

  Optional<Markdown> description();

  Optional<Code> language();

  Optional<String> name();

  Optional<CompartmentdefinitionCode> code();

  Optional<List<CompartmentDefinition_Resource>> resource();

  Optional<String> version();

  static ImmutableCompartmentDefinition.ResourceTypeBuildStage builder() {
    return ImmutableCompartmentDefinition.builder();
  }
}
