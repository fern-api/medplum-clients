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
    as = ImmutableOperationDefinition.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface OperationDefinition {
  Optional<dateTime> date();

  Optional<List<Extension>> extension();

  Optional<id> id();

  Optional<code> language();

  Optional<canonical> base();

  Optional<Boolean> type();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<Meta> meta();

  Optional<Boolean> affectsState();

  Optional<List<OperationDefinition_Parameter>> parameter();

  Optional<String> name();

  Optional<String> title();

  Optional<List<Extension>> modifierExtension();

  Optional<OperationdefinitionStatus> status();

  Optional<canonical> inputProfile();

  Optional<markdown> description();

  Optional<Narrative> text();

  Optional<OperationdefinitionKind> kind();

  Optional<markdown> comment();

  Optional<Boolean> experimental();

  Optional<List<ContactDetail>> contact();

  Optional<Boolean> system();

  Optional<canonical> outputProfile();

  Optional<uri> implicitRules();

  Optional<List<OperationDefinition_Overload>> overload();

  Optional<List<code>> resource();

  Optional<String> publisher();

  Optional<markdown> purpose();

  Optional<List<ResourceList>> contained();

  Optional<uri> url();

  String resourceType();

  Optional<code> code();

  Optional<Boolean> instance();

  Optional<List<UsageContext>> useContext();

  Optional<String> version();

  static ImmutableOperationDefinition.ResourceTypeBuildStage builder() {
    return ImmutableOperationDefinition.builder();
  }
}
