package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
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
  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> modifierExtension();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<List<ContactDetail>> contact();

  String resourceType();

  Optional<Id> id();

  Optional<List<Extension>> extension();

  Optional<String> responsible();

  Optional<Uri> implicitRules();

  Optional<String> usage();

  Optional<CodeableConcept> type();

  List<NamingSystem_UniqueId> uniqueId();

  Optional<Meta> meta();

  Optional<Markdown> description();

  Optional<String> name();

  Optional<Code> language();

  Optional<Narrative> text();

  Optional<NamingsystemKind> kind();

  Optional<String> publisher();

  Optional<List<UsageContext>> useContext();

  Optional<DateTime> date();

  Optional<NamingsystemStatus> status();

  static ImmutableNamingSystem.ResourceTypeBuildStage builder() {
    return ImmutableNamingSystem.builder();
  }
}
