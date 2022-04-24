package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableNamingSystem.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface NamingSystem {
  Optional<markdown> description();

  Optional<id> id();

  Optional<dateTime> date();

  Optional<List<ContactDetail>> contact();

  Optional<String> usage();

  Optional<String> publisher();

  Optional<NamingsystemStatus> status();

  Optional<String> responsible();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<List<Extension>> modifierExtension();

  Optional<uri> implicitRules();

  Optional<CodeableConcept> type();

  String resourceType();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> extension();

  Optional<List<UsageContext>> useContext();

  Optional<code> language();

  Optional<NamingsystemKind> kind();

  Optional<Meta> meta();

  List<NamingSystem_UniqueId> uniqueId();

  Optional<Narrative> text();

  Optional<String> name();

  static ImmutableNamingSystem.ResourceTypeBuildStage builder() {
    return ImmutableNamingSystem.builder();
  }
}
