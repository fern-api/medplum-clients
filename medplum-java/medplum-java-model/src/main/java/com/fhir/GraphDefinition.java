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
    as = ImmutableGraphDefinition.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface GraphDefinition {
  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> modifierExtension();

  Optional<dateTime> date();

  Optional<code> language();

  Optional<code> start();

  Optional<List<GraphDefinition_Link>> link();

  Optional<canonical> profile();

  Optional<String> version();

  Optional<List<UsageContext>> useContext();

  Optional<GraphdefinitionStatus> status();

  Optional<id> id();

  Optional<Meta> meta();

  Optional<Narrative> text();

  Optional<String> name();

  Optional<uri> implicitRules();

  Optional<List<Extension>> extension();

  Optional<markdown> description();

  Optional<String> publisher();

  Optional<markdown> purpose();

  Optional<List<ContactDetail>> contact();

  Optional<Boolean> experimental();

  Optional<List<CodeableConcept>> jurisdiction();

  String resourceType();

  Optional<uri> url();

  static ImmutableGraphDefinition.ResourceTypeBuildStage builder() {
    return ImmutableGraphDefinition.builder();
  }
}
