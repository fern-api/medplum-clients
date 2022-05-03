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
    as = ImmutableCapabilityStatement_Resource.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface CapabilityStatement_Resource {
  Optional<List<Extension>> modifierExtension();

  Optional<List<CapabilityStatement_Interaction>> interaction();

  Optional<Boolean> conditionalCreate();

  Optional<List<String>> searchInclude();

  Optional<List<String>> searchRevInclude();

  Optional<Capabilitystatement_resourceVersioning> versioning();

  Optional<Code> type();

  Optional<List<Canonical>> supportedProfile();

  Optional<Canonical> profile();

  Optional<Markdown> documentation();

  Optional<List<Extension>> extension();

  Optional<Boolean> readHistory();

  Optional<Capabilitystatement_resourceConditionaldelete> conditionalDelete();

  Optional<String> id();

  Optional<Capabilitystatement_resourceConditionalread> conditionalRead();

  Optional<List<CapabilityStatement_Operation>> operation();

  Optional<Boolean> updateCreate();

  Optional<Boolean> conditionalUpdate();

  Optional<List<Capabilitystatement_resourceReferencepolicyItem>> referencePolicy();

  Optional<List<CapabilityStatement_SearchParam>> searchParam();

  static ImmutableCapabilityStatement_Resource.Builder builder() {
    return ImmutableCapabilityStatement_Resource.builder();
  }
}
