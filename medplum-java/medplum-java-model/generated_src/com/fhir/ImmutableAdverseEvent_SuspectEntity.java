package com.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link AdverseEvent_SuspectEntity}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAdverseEvent_SuspectEntity.builder()}.
 */
@Generated(from = "AdverseEvent_SuspectEntity", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableAdverseEvent_SuspectEntity implements AdverseEvent_SuspectEntity {
  private final Reference instance;
  private final @Nullable String id;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<AdverseEvent_Causality> causality;
  private final @Nullable List<Extension> extension;

  private ImmutableAdverseEvent_SuspectEntity(
      Reference instance,
      @Nullable String id,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<AdverseEvent_Causality> causality,
      @Nullable List<Extension> extension) {
    this.instance = instance;
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.causality = causality;
    this.extension = extension;
  }

  /**
   * @return The value of the {@code instance} attribute
   */
  @JsonProperty("instance")
  @Override
  public Reference instance() {
    return instance;
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code causality} attribute
   */
  @JsonProperty("causality")
  @Override
  public Optional<List<AdverseEvent_Causality>> causality() {
    return Optional.ofNullable(causality);
  }

  /**
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AdverseEvent_SuspectEntity#instance() instance} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for instance
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAdverseEvent_SuspectEntity withInstance(Reference value) {
    if (this.instance == value) return this;
    Reference newValue = Objects.requireNonNull(value, "instance");
    return new ImmutableAdverseEvent_SuspectEntity(newValue, this.id, this.modifierExtension, this.causality, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AdverseEvent_SuspectEntity#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdverseEvent_SuspectEntity withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableAdverseEvent_SuspectEntity(this.instance, newValue, this.modifierExtension, this.causality, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AdverseEvent_SuspectEntity#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdverseEvent_SuspectEntity withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableAdverseEvent_SuspectEntity(this.instance, value, this.modifierExtension, this.causality, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AdverseEvent_SuspectEntity#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdverseEvent_SuspectEntity withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableAdverseEvent_SuspectEntity(this.instance, this.id, newValue, this.causality, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AdverseEvent_SuspectEntity#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAdverseEvent_SuspectEntity withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableAdverseEvent_SuspectEntity(this.instance, this.id, value, this.causality, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AdverseEvent_SuspectEntity#causality() causality} attribute.
   * @param value The value for causality
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdverseEvent_SuspectEntity withCausality(List<AdverseEvent_Causality> value) {
    @Nullable List<AdverseEvent_Causality> newValue = Objects.requireNonNull(value, "causality");
    if (this.causality == newValue) return this;
    return new ImmutableAdverseEvent_SuspectEntity(this.instance, this.id, this.modifierExtension, newValue, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AdverseEvent_SuspectEntity#causality() causality} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for causality
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAdverseEvent_SuspectEntity withCausality(Optional<? extends List<AdverseEvent_Causality>> optional) {
    @Nullable List<AdverseEvent_Causality> value = optional.orElse(null);
    if (this.causality == value) return this;
    return new ImmutableAdverseEvent_SuspectEntity(this.instance, this.id, this.modifierExtension, value, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AdverseEvent_SuspectEntity#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdverseEvent_SuspectEntity withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableAdverseEvent_SuspectEntity(this.instance, this.id, this.modifierExtension, this.causality, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AdverseEvent_SuspectEntity#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAdverseEvent_SuspectEntity withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableAdverseEvent_SuspectEntity(this.instance, this.id, this.modifierExtension, this.causality, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAdverseEvent_SuspectEntity} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAdverseEvent_SuspectEntity
        && equalTo((ImmutableAdverseEvent_SuspectEntity) another);
  }

  private boolean equalTo(ImmutableAdverseEvent_SuspectEntity another) {
    return instance.equals(another.instance)
        && Objects.equals(id, another.id)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(causality, another.causality)
        && Objects.equals(extension, another.extension);
  }

  /**
   * Computes a hash code from attributes: {@code instance}, {@code id}, {@code modifierExtension}, {@code causality}, {@code extension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + instance.hashCode();
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(causality);
    h += (h << 5) + Objects.hashCode(extension);
    return h;
  }

  /**
   * Prints the immutable value {@code AdverseEvent_SuspectEntity} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("AdverseEvent_SuspectEntity{");
    builder.append("instance=").append(instance);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (causality != null) {
      builder.append(", ");
      builder.append("causality=").append(causality);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "AdverseEvent_SuspectEntity", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements AdverseEvent_SuspectEntity {
    @Nullable Reference instance;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<AdverseEvent_Causality>> causality = Optional.empty();
    boolean causalityIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @JsonProperty("instance")
    public void setInstance(Reference instance) {
      this.instance = instance;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("causality")
    public void setCausality(Optional<List<AdverseEvent_Causality>> causality) {
      this.causality = causality;
      this.causalityIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @Override
    public Reference instance() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<AdverseEvent_Causality>> causality() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableAdverseEvent_SuspectEntity fromJson(Json json) {
    ImmutableAdverseEvent_SuspectEntity.Builder builder = ((ImmutableAdverseEvent_SuspectEntity.Builder) ImmutableAdverseEvent_SuspectEntity.builder());
    if (json.instance != null) {
      builder.instance(json.instance);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.causalityIsSet) {
      builder.causality(json.causality);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    return (ImmutableAdverseEvent_SuspectEntity) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link AdverseEvent_SuspectEntity} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable AdverseEvent_SuspectEntity instance
   */
  public static AdverseEvent_SuspectEntity copyOf(AdverseEvent_SuspectEntity instance) {
    if (instance instanceof ImmutableAdverseEvent_SuspectEntity) {
      return (ImmutableAdverseEvent_SuspectEntity) instance;
    }
    return ((ImmutableAdverseEvent_SuspectEntity.Builder) ImmutableAdverseEvent_SuspectEntity.builder())
        .instance(instance.instance())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .causality(instance.causality())
        .extension(instance.extension())
        .build();
  }

  /**
   * Creates a builder for {@link AdverseEvent_SuspectEntity AdverseEvent_SuspectEntity}.
   * <pre>
   * ImmutableAdverseEvent_SuspectEntity.builder()
   *    .instance(com.fhir.Reference) // required {@link AdverseEvent_SuspectEntity#instance() instance}
   *    .id(String) // optional {@link AdverseEvent_SuspectEntity#id() id}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link AdverseEvent_SuspectEntity#modifierExtension() modifierExtension}
   *    .causality(List&amp;lt;com.fhir.AdverseEvent_Causality&amp;gt;) // optional {@link AdverseEvent_SuspectEntity#causality() causality}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link AdverseEvent_SuspectEntity#extension() extension}
   *    .build();
   * </pre>
   * @return A new AdverseEvent_SuspectEntity builder
   */
  public static InstanceBuildStage builder() {
    return new ImmutableAdverseEvent_SuspectEntity.Builder();
  }

  /**
   * Builds instances of type {@link AdverseEvent_SuspectEntity AdverseEvent_SuspectEntity}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "AdverseEvent_SuspectEntity", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements InstanceBuildStage, BuildFinal {
    private static final long INIT_BIT_INSTANCE = 0x1L;
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_CAUSALITY = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable Reference instance;
    private @Nullable String id;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<AdverseEvent_Causality> causality;
    private @Nullable List<Extension> extension;

    private Builder() {
    }

    /**
     * Initializes the value for the {@link AdverseEvent_SuspectEntity#instance() instance} attribute.
     * @param instance The value for instance 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("instance")
    public final Builder instance(Reference instance) {
      checkNotIsSet(instanceIsSet(), "instance");
      this.instance = Objects.requireNonNull(instance, "instance");
      initBits &= ~INIT_BIT_INSTANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent_SuspectEntity#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(String id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent_SuspectEntity#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<String> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent_SuspectEntity#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    public final Builder modifierExtension(List<Extension> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = Objects.requireNonNull(modifierExtension, "modifierExtension");
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent_SuspectEntity#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("modifierExtension")
    public final Builder modifierExtension(Optional<? extends List<Extension>> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = modifierExtension.orElse(null);
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent_SuspectEntity#causality() causality} to causality.
     * @param causality The value for causality
     * @return {@code this} builder for chained invocation
     */
    public final Builder causality(List<AdverseEvent_Causality> causality) {
      checkNotIsSet(causalityIsSet(), "causality");
      this.causality = Objects.requireNonNull(causality, "causality");
      optBits |= OPT_BIT_CAUSALITY;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent_SuspectEntity#causality() causality} to causality.
     * @param causality The value for causality
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("causality")
    public final Builder causality(Optional<? extends List<AdverseEvent_Causality>> causality) {
      checkNotIsSet(causalityIsSet(), "causality");
      this.causality = causality.orElse(null);
      optBits |= OPT_BIT_CAUSALITY;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent_SuspectEntity#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    public final Builder extension(List<Extension> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = Objects.requireNonNull(extension, "extension");
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent_SuspectEntity#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("extension")
    public final Builder extension(Optional<? extends List<Extension>> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = extension.orElse(null);
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Builds a new {@link AdverseEvent_SuspectEntity AdverseEvent_SuspectEntity}.
     * @return An immutable instance of AdverseEvent_SuspectEntity
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public AdverseEvent_SuspectEntity build() {
      checkRequiredAttributes();
      return new ImmutableAdverseEvent_SuspectEntity(instance, id, modifierExtension, causality, extension);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean causalityIsSet() {
      return (optBits & OPT_BIT_CAUSALITY) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean instanceIsSet() {
      return (initBits & INIT_BIT_INSTANCE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of AdverseEvent_SuspectEntity is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!instanceIsSet()) attributes.add("instance");
      return "Cannot build AdverseEvent_SuspectEntity, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "AdverseEvent_SuspectEntity", generator = "Immutables")
  public interface InstanceBuildStage {
    /**
     * Initializes the value for the {@link AdverseEvent_SuspectEntity#instance() instance} attribute.
     * @param instance The value for instance 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal instance(Reference instance);
  }

  @Generated(from = "AdverseEvent_SuspectEntity", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link AdverseEvent_SuspectEntity#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link AdverseEvent_SuspectEntity#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link AdverseEvent_SuspectEntity#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link AdverseEvent_SuspectEntity#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link AdverseEvent_SuspectEntity#causality() causality} to causality.
     * @param causality The value for causality
     * @return {@code this} builder for chained invocation
     */
    BuildFinal causality(List<AdverseEvent_Causality> causality);

    /**
     * Initializes the optional value {@link AdverseEvent_SuspectEntity#causality() causality} to causality.
     * @param causality The value for causality
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal causality(Optional<? extends List<AdverseEvent_Causality>> causality);

    /**
     * Initializes the optional value {@link AdverseEvent_SuspectEntity#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link AdverseEvent_SuspectEntity#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Builds a new {@link AdverseEvent_SuspectEntity AdverseEvent_SuspectEntity}.
     * @return An immutable instance of AdverseEvent_SuspectEntity
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    AdverseEvent_SuspectEntity build();
  }
}