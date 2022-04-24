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
    as = ImmutableMessageDefinition.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MessageDefinition {
  Optional<uri> url();

  Optional<List<canonical>> replaces();

  Optional<String> version();

  Optional<String> name();

  Optional<List<MessageDefinition_Focus>> focus();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<MessagedefinitionResponserequired> responseRequired();

  Optional<uri> implicitRules();

  Optional<List<Identifier>> identifier();

  Optional<List<UsageContext>> useContext();

  Optional<List<Extension>> modifierExtension();

  Optional<id> id();

  Optional<String> publisher();

  Optional<markdown> description();

  Optional<Meta> meta();

  Optional<String> eventUri();

  Optional<markdown> purpose();

  Optional<List<ContactDetail>> contact();

  Optional<Narrative> text();

  String resourceType();

  Optional<List<Extension>> extension();

  Optional<code> language();

  Optional<String> title();

  Optional<List<canonical>> parent();

  Optional<List<ResourceList>> contained();

  Optional<MessagedefinitionCategory> category();

  Optional<List<canonical>> graph();

  Optional<markdown> copyright();

  Optional<MessagedefinitionStatus> status();

  Optional<Boolean> experimental();

  Optional<dateTime> date();

  Optional<Coding> eventCoding();

  Optional<List<MessageDefinition_AllowedResponse>> allowedResponse();

  Optional<canonical> base();

  static ImmutableMessageDefinition.ResourceTypeBuildStage builder() {
    return ImmutableMessageDefinition.builder();
  }
}
