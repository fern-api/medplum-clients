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
    as = ImmutableImplementationGuide.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ImplementationGuide {
  Optional<String> name();

  Optional<Uri> implicitRules();

  Optional<ImplementationguideLicense> license();

  Optional<List<ResourceList>> contained();

  Optional<Id> id();

  Optional<Markdown> description();

  String resourceType();

  Optional<List<ContactDetail>> contact();

  Optional<List<UsageContext>> useContext();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<DateTime> date();

  Optional<List<ImplementationGuide_DependsOn>> dependsOn();

  Optional<Narrative> text();

  Optional<String> version();

  Optional<ImplementationguideStatus> status();

  Optional<Uri> url();

  Optional<List<Extension>> extension();

  Optional<String> title();

  Optional<Id> packageId();

  Optional<ImplementationGuide_Manifest> manifest();

  Optional<Meta> meta();

  Optional<Boolean> experimental();

  Optional<List<Extension>> modifierExtension();

  Optional<List<ImplementationGuide_Global>> global();

  Optional<String> publisher();

  Optional<List<ImplementationguideFhirversionItem>> fhirVersion();

  Optional<Markdown> copyright();

  Optional<Code> language();

  Optional<ImplementationGuide_Definition> definition();

  static ImmutableImplementationGuide.ResourceTypeBuildStage builder() {
    return ImmutableImplementationGuide.builder();
  }
}
